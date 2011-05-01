/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixengine.org 
 * license as defined by quickfixengine.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixengine.org/LICENSE for licensing information. 
 * 
 * Contact ask@quickfixengine.org if any conditions of this licensing 
 * are not clear to you.
 ******************************************************************************/

package quickfix;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static quickfix.field.ApplVerID.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.quickfixj.QFJException;

import quickfix.field.ApplVerID;

public class DefaultDataDictionaryProviderTest {
    private static final String CUSTOM_APP_VERSION = "Custom_Test";
    private static DataDictionary dictionaryForTest1;
    private static DataDictionary dictionaryForTest2;

    @BeforeClass
    public static void setUp() throws Exception {
        dictionaryForTest1 = new DataDictionary("FIX44_Custom_Test.xml");
        dictionaryForTest2 = new DataDictionary(dictionaryForTest1);
    }
    
    @Test
    public void returnRegisteredSessonDictionaryWithoutDiscovery() throws Exception {
        DefaultDataDictionaryProvider provider = new DefaultDataDictionaryProvider(false);
        provider.addTransportDictionary(FixVersions.BEGINSTRING_FIX42, dictionaryForTest1);
        provider.addTransportDictionary(FixVersions.BEGINSTRING_FIX44, dictionaryForTest2);
        
        DataDictionary dd = provider.getSessionDataDictionary(FixVersions.BEGINSTRING_FIX44);
        
        assertThat(dd, is(dictionaryForTest2));
    }

    @Test
    public void returnNullSessonDictionaryWithoutDiscovery() throws Exception {
        DefaultDataDictionaryProvider provider = new DefaultDataDictionaryProvider(false);
        provider.addTransportDictionary(FixVersions.BEGINSTRING_FIX42, dictionaryForTest1);
        
        DataDictionary dd = provider.getSessionDataDictionary(FixVersions.BEGINSTRING_FIX44);
        
        assertThat(dd, is(nullValue()));
    }

    @Test
    public void returnSessionDictionaryWithDiscovery() throws Exception {
        DefaultDataDictionaryProvider provider = new DefaultDataDictionaryProvider();
        
        DataDictionary dd = provider.getSessionDataDictionary(FixVersions.BEGINSTRING_FIX40);
        
        assertThat(dd, is(notNullValue()));
        assertThat(dd.getVersion(), is(FixVersions.BEGINSTRING_FIX40));
    }

    @Test
    public void throwExceptionIfSessionDictionaryIsNotFound() throws Exception {
        DefaultDataDictionaryProvider provider = new DefaultDataDictionaryProvider();
        
        try {
            provider.getSessionDataDictionary("FIX44_Invalid_Test");
        } catch (QFJException e) {
            assertThat(e.getCause(), is(ConfigError.class));
        }
    }

    @Test
    public void returnRegisteredAppDictionaryWithoutDiscovery() throws Exception {
        DefaultDataDictionaryProvider provider = new DefaultDataDictionaryProvider(false);
        provider.addApplicationDictionary(new ApplVerID(FIX44), dictionaryForTest1);
        provider.addApplicationDictionary(new ApplVerID(FIX40), dictionaryForTest2);
        
        DataDictionary dd = provider.getApplicationDataDictionary(new ApplVerID(FIX40));
        
        assertThat(dd, is(dictionaryForTest2));
    }

    @Test
    public void returnNullAppDictionaryWithoutDiscovery() throws Exception {
        DefaultDataDictionaryProvider provider = new DefaultDataDictionaryProvider(false);
        provider.addApplicationDictionary(new ApplVerID(FIX44), dictionaryForTest1);
        
        DataDictionary dd = provider.getApplicationDataDictionary(new ApplVerID(FIX40));
        
        assertThat(dd, is(nullValue()));
    }

    @Test
    public void returnAppDictionaryWithDiscovery() throws Exception {
        DefaultDataDictionaryProvider provider = new DefaultDataDictionaryProvider();
        provider.addApplicationDictionary(new ApplVerID(FIX44), dictionaryForTest1);
        
        DataDictionary dd = provider.getApplicationDataDictionary(new ApplVerID(FIX40));
        
        assertThat(dd, is(notNullValue()));
        assertThat(dd.getVersion(), is(FixVersions.BEGINSTRING_FIX40));
    }
    
    @Test
    public void throwExceptionIfAppDictionaryIsNotFound() throws Exception {
        DefaultDataDictionaryProvider provider = new DefaultDataDictionaryProvider();
        
        try {
            provider.getApplicationDataDictionary(new ApplVerID("Invalid_Test"));
        } catch (QFJException e) {
            assertThat(e.getMessage(), containsString("Unknown or unsupported ApplVerID"));
        }
    }

    @Test
    public void throwExceptionIfAppVersionIsNotFound() throws Exception {
        DefaultDataDictionaryProvider provider = new DefaultDataDictionaryProvider();
        
        try {
            provider.getApplicationDataDictionary(new ApplVerID("999"));
        } catch (QFJException e) {
            assertThat(e.getMessage(), containsString(" 999"));
        }
    }
}
