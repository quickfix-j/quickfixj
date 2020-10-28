#Orchestra 2 QuickFIX/J

This module depends on the FIX Latest repository which is an "orchestration" published by the FIX Trading Community.
The repository is processed to generate a QuickFIX and QUICKFIX/J compatible FIX dictionary.

Before generating the dictionary this module runs XSL transformation to remove elements from the standard repository that cause issues in the QFJ build. If and when the published standard is corrected then this transform can be edited or removed.

After generating the dictionary this module runs an XSL transformation to add an attribute identifying the resulting dictionary file as a "FIX Latest" file. This allows the QFJ code generation processing to be customised for processing the FIX Latest messages. See the code generator module for details.
