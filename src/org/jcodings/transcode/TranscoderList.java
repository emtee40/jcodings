/*
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.jcodings.transcode;

import org.jcodings.transcode.Transcoder.GenericTranscoderEntry;

final class TranscoderList {
    static final String[][] LIST = new String[][] {
        {"Big5", "UTF-8", null /*From_Big5*/},
        {"UTF-8", "Big5", null /*To_Big5*/},
        {"CP950", "UTF-8", null /*From_CP950*/},
        {"UTF-8", "CP950", null /*To_CP950*/},
        {"Big5-HKSCS", "UTF-8", null /*From_Big5_HKSCS*/},
        {"UTF-8", "Big5-HKSCS", null /*To_Big5_HKSCS*/},
        {"CP951", "UTF-8", null /*From_CP951*/},
        {"UTF-8", "CP951", null /*To_CP951*/},
        {"Big5-UAO", "UTF-8", null /*From_Big5_UAO*/},
        {"UTF-8", "Big5-UAO", null /*To_Big5_UAO*/},
        {"GB2312", "UTF-8", null /*From_GB2312*/},
        {"GB12345", "UTF-8", null /*From_GB12345*/},
        {"UTF-8", "GB2312", null /*To_GB2312*/},
        {"UTF-8", "GB12345", null /*To_GB12345*/},
        {"UTF8-DoCoMo", "UTF8-KDDI", null /*From_UTF8_DoCoMo_to_UTF8_KDDI*/},
        {"UTF8-DoCoMo", "UTF8-SoftBank", null /*From_UTF8_DoCoMo_to_UTF8_SoftBank*/},
        {"UTF8-DoCoMo", "UTF-8", null /*From_UTF8_DoCoMo*/},
        {"UTF8-KDDI", "UTF8-DoCoMo", null /*From_UTF8_KDDI_to_UTF8_DoCoMo*/},
        {"UTF8-KDDI", "UTF8-SoftBank", null /*From_UTF8_KDDI_to_UTF8_SoftBank*/},
        {"UTF8-KDDI", "UTF-8", null /*From_UTF8_KDDI*/},
        {"UTF8-SoftBank", "UTF8-DoCoMo", null /*From_UTF8_SoftBank_to_UTF8_DoCoMo*/},
        {"UTF8-SoftBank", "UTF8-KDDI", null /*From_UTF8_SoftBank_to_UTF8_KDDI*/},
        {"UTF8-SoftBank", "UTF-8", null /*From_UTF8_SoftBank*/},
        {"UTF-8", "UTF8-DoCoMo", null /*To_UTF8_DoCoMo*/},
        {"UTF-8", "UTF8-KDDI", null /*To_UTF8_KDDI*/},
        {"UTF-8", "UTF8-SoftBank", null /*To_UTF8_SoftBank*/},
        {"stateless-ISO-2022-JP-KDDI", "UTF8-KDDI", null /*From_stateless_ISO_2022_JP_KDDI_to_UTF8_KDDI*/},
        {"UTF8-KDDI", "stateless-ISO-2022-JP-KDDI", null /*From_UTF8_KDDI_to_stateless_ISO_2022_JP_KDDI*/},
        {"ISO-2022-JP-KDDI", "stateless-ISO-2022-JP-KDDI", "Iso2022jp_kddi_decoder"},
        {"stateless-ISO-2022-JP-KDDI", "ISO-2022-JP-KDDI", "Iso2022jp_kddi_encoder"},
        {"SJIS-DOCOMO", "UTF8-DOCOMO", null /*From_SJIS_DOCOMO_to_UTF8_DOCOMO*/},
        {"UTF8-DOCOMO", "SJIS-DOCOMO", null /*From_UTF8_DOCOMO_to_SJIS_DOCOMO*/},
        {"SJIS-KDDI", "UTF8-KDDI", null /*From_SJIS_KDDI_to_UTF8_KDDI*/},
        {"UTF8-KDDI", "SJIS-KDDI", null /*From_UTF8_KDDI_to_SJIS_KDDI*/},
        {"SJIS-SoftBank", "UTF8-SoftBank", null /*From_SJIS_SoftBank_to_UTF8_SoftBank*/},
        {"UTF8-SoftBank", "SJIS-SoftBank", null /*From_UTF8_SoftBank_to_SJIS_SoftBank*/},
        {"", "amp_escape", null /*From__to_amp_escape*/},
        {"", "xml_text_escape", null /*From__to_xml_text_escape*/},
        {"", "xml_attr_content_escape", null /*From__to_xml_attr_content_escape*/},
        {"", "xml_attr_quote", "Escape_xml_attr_quote"},
        {"GB18030", "UTF-8", "From_GB18030"},
        {"UTF-8", "GB18030", "To_GB18030"},
        {"GBK", "UTF-8", null /*From_GBK*/},
        {"UTF-8", "GBK", null /*To_GBK*/},
        {"ISO-2022-JP", "stateless-ISO-2022-JP", "Iso2022jp_decoder"},
        {"stateless-ISO-2022-JP", "ISO-2022-JP", "Iso2022jp_encoder"},
        {"stateless-ISO-2022-JP", "EUC-JP", "Stateless_iso2022jp_to_eucjp"},
        {"EUC-JP", "stateless-ISO-2022-JP", "Eucjp_to_stateless_iso2022jp"},
        {"CP50220", "cp51932", "Cp50220_decoder"},
        {"CP50221", "cp51932", "Cp50221_decoder"},
        {"CP51932", "CP50221", "Cp50221_encoder"},
        {"CP51932", "CP50220", "Cp50220_encoder"},
        {"EUC-JP", "Shift_JIS", "Eucjp2sjis"},
        {"Shift_JIS", "EUC-JP", "Sjis2eucjp"},
        {"EUC-JP", "UTF-8", null /*From_EUC_JP*/},
        {"eucJP-ms", "UTF-8", null /*From_eucJP_ms*/},
        {"CP51932", "UTF-8", null /*From_CP51932*/},
        {"UTF-8", "EUC-JP", null /*To_EUC_JP*/},
        {"UTF-8", "eucJP-ms", null /*To_eucJP_ms*/},
        {"UTF-8", "CP51932", null /*To_CP51932*/},
        {"Shift_JIS", "UTF-8", null /*From_Shift_JIS*/},
        {"Windows-31J", "UTF-8", null /*From_Windows_31J*/},
        {"UTF-8", "Shift_JIS", null /*To_Shift_JIS*/},
        {"UTF-8", "Windows-31J", null /*To_Windows_31J*/},
        {"UTF-8", "EUC-KR", null /*To_EUC_KR*/},
        {"EUC-KR", "UTF-8", null /*From_EUC_KR*/},
        {"UTF-8", "CP949", null /*To_CP949*/},
        {"CP949", "UTF-8", null /*From_CP949*/},
        {"US-ASCII", "UTF-8", null /*From_US_ASCII*/},
        {"UTF-8", "US-ASCII", null /*To_US_ASCII*/},
        {"ASCII-8BIT", "UTF-8", null /*From_ASCII_8BIT*/},
        {"UTF-8", "ASCII-8BIT", null /*To_ASCII_8BIT*/},
        {"ISO-8859-1", "UTF-8", null /*From_ISO_8859_1*/},
        {"UTF-8", "ISO-8859-1", null /*To_ISO_8859_1*/},
        {"ISO-8859-2", "UTF-8", null /*From_ISO_8859_2*/},
        {"UTF-8", "ISO-8859-2", null /*To_ISO_8859_2*/},
        {"ISO-8859-3", "UTF-8", null /*From_ISO_8859_3*/},
        {"UTF-8", "ISO-8859-3", null /*To_ISO_8859_3*/},
        {"ISO-8859-4", "UTF-8", null /*From_ISO_8859_4*/},
        {"UTF-8", "ISO-8859-4", null /*To_ISO_8859_4*/},
        {"ISO-8859-5", "UTF-8", null /*From_ISO_8859_5*/},
        {"UTF-8", "ISO-8859-5", null /*To_ISO_8859_5*/},
        {"ISO-8859-6", "UTF-8", null /*From_ISO_8859_6*/},
        {"UTF-8", "ISO-8859-6", null /*To_ISO_8859_6*/},
        {"ISO-8859-7", "UTF-8", null /*From_ISO_8859_7*/},
        {"UTF-8", "ISO-8859-7", null /*To_ISO_8859_7*/},
        {"ISO-8859-8", "UTF-8", null /*From_ISO_8859_8*/},
        {"UTF-8", "ISO-8859-8", null /*To_ISO_8859_8*/},
        {"ISO-8859-9", "UTF-8", null /*From_ISO_8859_9*/},
        {"UTF-8", "ISO-8859-9", null /*To_ISO_8859_9*/},
        {"ISO-8859-10", "UTF-8", null /*From_ISO_8859_10*/},
        {"UTF-8", "ISO-8859-10", null /*To_ISO_8859_10*/},
        {"ISO-8859-11", "UTF-8", null /*From_ISO_8859_11*/},
        {"UTF-8", "ISO-8859-11", null /*To_ISO_8859_11*/},
        {"ISO-8859-13", "UTF-8", null /*From_ISO_8859_13*/},
        {"UTF-8", "ISO-8859-13", null /*To_ISO_8859_13*/},
        {"ISO-8859-14", "UTF-8", null /*From_ISO_8859_14*/},
        {"UTF-8", "ISO-8859-14", null /*To_ISO_8859_14*/},
        {"ISO-8859-15", "UTF-8", null /*From_ISO_8859_15*/},
        {"UTF-8", "ISO-8859-15", null /*To_ISO_8859_15*/},
        {"WINDOWS-874", "UTF-8", null /*From_WINDOWS_874*/},
        {"UTF-8", "WINDOWS-874", null /*To_WINDOWS_874*/},
        {"WINDOWS-1250", "UTF-8", null /*From_WINDOWS_1250*/},
        {"UTF-8", "WINDOWS-1250", null /*To_WINDOWS_1250*/},
        {"WINDOWS-1251", "UTF-8", null /*From_WINDOWS_1251*/},
        {"UTF-8", "WINDOWS-1251", null /*To_WINDOWS_1251*/},
        {"WINDOWS-1252", "UTF-8", null /*From_WINDOWS_1252*/},
        {"UTF-8", "WINDOWS-1252", null /*To_WINDOWS_1252*/},
        {"WINDOWS-1253", "UTF-8", null /*From_WINDOWS_1253*/},
        {"UTF-8", "WINDOWS-1253", null /*To_WINDOWS_1253*/},
        {"WINDOWS-1254", "UTF-8", null /*From_WINDOWS_1254*/},
        {"UTF-8", "WINDOWS-1254", null /*To_WINDOWS_1254*/},
        {"WINDOWS-1255", "UTF-8", null /*From_WINDOWS_1255*/},
        {"UTF-8", "WINDOWS-1255", null /*To_WINDOWS_1255*/},
        {"WINDOWS-1256", "UTF-8", null /*From_WINDOWS_1256*/},
        {"UTF-8", "WINDOWS-1256", null /*To_WINDOWS_1256*/},
        {"WINDOWS-1257", "UTF-8", null /*From_WINDOWS_1257*/},
        {"UTF-8", "WINDOWS-1257", null /*To_WINDOWS_1257*/},
        {"IBM437", "UTF-8", null /*From_IBM437*/},
        {"UTF-8", "IBM437", null /*To_IBM437*/},
        {"IBM775", "UTF-8", null /*From_IBM775*/},
        {"UTF-8", "IBM775", null /*To_IBM775*/},
        {"IBM737", "UTF-8", null /*From_IBM737*/},
        {"UTF-8", "IBM737", null /*To_IBM737*/},
        {"IBM852", "UTF-8", null /*From_IBM852*/},
        {"UTF-8", "IBM852", null /*To_IBM852*/},
        {"IBM855", "UTF-8", null /*From_IBM855*/},
        {"UTF-8", "IBM855", null /*To_IBM855*/},
        {"IBM857", "UTF-8", null /*From_IBM857*/},
        {"UTF-8", "IBM857", null /*To_IBM857*/},
        {"IBM860", "UTF-8", null /*From_IBM860*/},
        {"UTF-8", "IBM860", null /*To_IBM860*/},
        {"IBM861", "UTF-8", null /*From_IBM861*/},
        {"UTF-8", "IBM861", null /*To_IBM861*/},
        {"IBM862", "UTF-8", null /*From_IBM862*/},
        {"UTF-8", "IBM862", null /*To_IBM862*/},
        {"IBM863", "UTF-8", null /*From_IBM863*/},
        {"UTF-8", "IBM863", null /*To_IBM863*/},
        {"IBM865", "UTF-8", null /*From_IBM865*/},
        {"UTF-8", "IBM865", null /*To_IBM865*/},
        {"IBM866", "UTF-8", null /*From_IBM866*/},
        {"UTF-8", "IBM866", null /*To_IBM866*/},
        {"IBM869", "UTF-8", null /*From_IBM869*/},
        {"UTF-8", "IBM869", null /*To_IBM869*/},
        {"MACCROATIAN", "UTF-8", null /*From_MACCROATIAN*/},
        {"UTF-8", "MACCROATIAN", null /*To_MACCROATIAN*/},
        {"MACCYRILLIC", "UTF-8", null /*From_MACCYRILLIC*/},
        {"UTF-8", "MACCYRILLIC", null /*To_MACCYRILLIC*/},
        {"MACGREEK", "UTF-8", null /*From_MACGREEK*/},
        {"UTF-8", "MACGREEK", null /*To_MACGREEK*/},
        {"MACICELAND", "UTF-8", null /*From_MACICELAND*/},
        {"UTF-8", "MACICELAND", null /*To_MACICELAND*/},
        {"MACROMAN", "UTF-8", null /*From_MACROMAN*/},
        {"UTF-8", "MACROMAN", null /*To_MACROMAN*/},
        {"MACROMANIA", "UTF-8", null /*From_MACROMANIA*/},
        {"UTF-8", "MACROMANIA", null /*To_MACROMANIA*/},
        {"MACTURKISH", "UTF-8", null /*From_MACTURKISH*/},
        {"UTF-8", "MACTURKISH", null /*To_MACTURKISH*/},
        {"MACUKRAINE", "UTF-8", null /*From_MACUKRAINE*/},
        {"UTF-8", "MACUKRAINE", null /*To_MACUKRAINE*/},
        {"KOI8-U", "UTF-8", null /*From_KOI8_U*/},
        {"UTF-8", "KOI8-U", null /*To_KOI8_U*/},
        {"KOI8-R", "UTF-8", null /*From_KOI8_R*/},
        {"UTF-8", "KOI8-R", null /*To_KOI8_R*/},
        {"TIS-620", "UTF-8", null /*From_TIS_620*/},
        {"UTF-8", "TIS-620", null /*To_TIS_620*/},
        {"CP850", "UTF-8", null /*From_CP850*/},
        {"UTF-8", "CP850", null /*To_CP850*/},
        {"CP852", "UTF-8", null /*From_CP852*/},
        {"UTF-8", "CP852", null /*To_CP852*/},
        {"CP855", "UTF-8", null /*From_CP855*/},
        {"UTF-8", "CP855", null /*To_CP855*/},
        {"UTF-8", "UTF8-MAC", null /*To_UTF8_MAC*/},
        {"UTF8-MAC", "UTF-8", "From_UTF8_MAC"},
        {"UTF-16BE", "UTF-8", "From_UTF_16BE"},
        {"UTF-8", "UTF-16BE", "To_UTF_16BE"},
        {"UTF-16LE", "UTF-8", "From_UTF_16LE"},
        {"UTF-8", "UTF-16LE", "To_UTF_16LE"},
        {"UTF-32BE", "UTF-8", "From_UTF_32BE"},
        {"UTF-8", "UTF-32BE", "To_UTF_32BE"},
        {"UTF-32LE", "UTF-8", "From_UTF_32LE"},
        {"UTF-8", "UTF-32LE", "To_UTF_32LE"},
        {"UTF-16", "UTF-8", "From_UTF_16"},
        {"UTF-32", "UTF-8", "From_UTF_32"},
        {"UTF-8", "UTF-16", "To_UTF_16"},
        {"UTF-8", "UTF-32", "To_UTF_32"}
    };

    static final GenericTranscoderEntry[] GENERIC_LIST = new GenericTranscoderEntry[] {
        new GenericTranscoderEntry("Big5", "UTF-8", 57100, "Big5", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "Big5", 120168, "Big5", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("CP950", "UTF-8", 144368, "Big5", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "CP950", 172296, "Big5", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("Big5-HKSCS", "UTF-8", 195416, "Big5", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "Big5-HKSCS", 288228, "Big5", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("CP951", "UTF-8", 309868, "Big5", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "CP951", 325724, "Big5", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("Big5-UAO", "UTF-8", 351812, "Big5", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "Big5-UAO", 436940, "Big5", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("GB2312", "UTF-8", 31136, "Chinese", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("GB12345", "UTF-8", 59848, "Chinese", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "GB2312", 96820, "Chinese", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "GB12345", 130816, "Chinese", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-DoCoMo", "UTF8-KDDI", 1176, "Emoji", 1, 4, 6, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-DoCoMo", "UTF8-SoftBank", 2148, "Emoji", 1, 4, 6, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-DoCoMo", "UTF-8", 2616, "Emoji", 1, 4, 4, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-KDDI", "UTF8-DoCoMo", 5684, "Emoji", 1, 4, 6, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-KDDI", "UTF8-SoftBank", 9996, "Emoji", 1, 4, 6, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-KDDI", "UTF-8", 11544, "Emoji", 1, 4, 8, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-SoftBank", "UTF8-DoCoMo", 12784, "Emoji", 1, 4, 6, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-SoftBank", "UTF8-KDDI", 14812, "Emoji", 1, 4, 3, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-SoftBank", "UTF-8", 15460, "Emoji", 1, 4, 8, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "UTF8-DoCoMo", 17620, "Emoji", 1, 4, 6, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "UTF8-KDDI", 21120, "Emoji", 1, 4, 6, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "UTF8-SoftBank", 24060, "Emoji", 1, 4, 6, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("stateless-ISO-2022-JP-KDDI", "UTF8-KDDI", 33996, "EmojiIso2022Kddi", 1, 3, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-KDDI", "stateless-ISO-2022-JP-KDDI", 76404, "EmojiIso2022Kddi", 1, 4, 3, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-2022-JP-KDDI", "stateless-ISO-2022-JP-KDDI", 56, "EmojiIso2022Kddi", 1, 3, 3, AsciiCompatibility.DECODER, 1),
        new GenericTranscoderEntry("stateless-ISO-2022-JP-KDDI", "ISO-2022-JP-KDDI", 108, "EmojiIso2022Kddi", 1, 3, 5, AsciiCompatibility.ENCODER, 1),
        new GenericTranscoderEntry("SJIS-DOCOMO", "UTF8-DOCOMO", 39616, "EmojiSjisDocomo", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-DOCOMO", "SJIS-DOCOMO", 84704, "EmojiSjisDocomo", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("SJIS-KDDI", "UTF8-KDDI", 39616, "EmojiSjisKddi", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-KDDI", "SJIS-KDDI", 88668, "EmojiSjisKddi", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("SJIS-SoftBank", "UTF8-SoftBank", 39616, "EmojiSjisSoftbank", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-SoftBank", "SJIS-SoftBank", 84704, "EmojiSjisSoftbank", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("", "amp_escape", 8, "Escape", 1, 1, 5, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("", "xml_text_escape", 32, "Escape", 1, 1, 5, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("", "xml_attr_content_escape", 60, "Escape", 1, 1, 6, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("", "xml_attr_quote", 72, "Escape", 1, 1, 7, AsciiCompatibility.ENCODER, 1),
        new GenericTranscoderEntry("GB18030", "UTF-8", 57668, "Gb18030", 1, 4, 4, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "GB18030", 115576, "Gb18030", 1, 4, 4, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("GBK", "UTF-8", 89284, "Gbk", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "GBK", 182912, "Gbk", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-2022-JP", "stateless-ISO-2022-JP", 56, "Iso2022", 1, 3, 3, AsciiCompatibility.DECODER, 1),
        new GenericTranscoderEntry("stateless-ISO-2022-JP", "ISO-2022-JP", 108, "Iso2022", 1, 3, 5, AsciiCompatibility.ENCODER, 1),
        new GenericTranscoderEntry("stateless-ISO-2022-JP", "EUC-JP", 128, "Iso2022", 1, 3, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("EUC-JP", "stateless-ISO-2022-JP", 192, "Iso2022", 1, 3, 3, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("CP50220", "cp51932", 244, "Iso2022", 1, 3, 3, AsciiCompatibility.DECODER, 1),
        new GenericTranscoderEntry("CP50221", "cp51932", 244, "Iso2022", 1, 3, 3, AsciiCompatibility.DECODER, 1),
        new GenericTranscoderEntry("CP51932", "CP50221", 268, "Iso2022", 1, 3, 5, AsciiCompatibility.ENCODER, 1),
        new GenericTranscoderEntry("CP51932", "CP50220", 268, "Iso2022", 1, 3, 5, AsciiCompatibility.ENCODER, 3),
        new GenericTranscoderEntry("EUC-JP", "Shift_JIS", 88, "Japanese", 1, 3, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("Shift_JIS", "EUC-JP", 132, "Japanese", 1, 2, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("EUC-JP", "UTF-8", 54488, "JapaneseEuc", 1, 3, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("eucJP-ms", "UTF-8", 64480, "JapaneseEuc", 1, 3, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("CP51932", "UTF-8", 66380, "JapaneseEuc", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "EUC-JP", 125780, "JapaneseEuc", 1, 4, 3, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "eucJP-ms", 144752, "JapaneseEuc", 1, 4, 3, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "CP51932", 179440, "JapaneseEuc", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("Shift_JIS", "UTF-8", 28448, "JapaneseSjis", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("Windows-31J", "UTF-8", 40648, "JapaneseSjis", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "Shift_JIS", 75704, "JapaneseSjis", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "Windows-31J", 104500, "JapaneseSjis", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "EUC-KR", 44104, "Korean", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("EUC-KR", "UTF-8", 78484, "Korean", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "CP949", 126392, "Korean", 1, 4, 2, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("CP949", "UTF-8", 196860, "Korean", 1, 2, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("US-ASCII", "UTF-8", 8, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "US-ASCII", 132, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ASCII-8BIT", "UTF-8", 148, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ASCII-8BIT", 132, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-1", "UTF-8", 672, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-1", 1260, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-2", "UTF-8", 1784, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-2", 2440, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-3", "UTF-8", 2940, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-3", 3568, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-4", "UTF-8", 4092, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-4", 4748, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-5", "UTF-8", 5272, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-5", 5928, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-6", "UTF-8", 6276, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-6", 6712, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-7", "UTF-8", 7228, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-7", 7912, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-8", "UTF-8", 8296, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-8", 8808, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-9", "UTF-8", 9332, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-9", 9696, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-10", "UTF-8", 10220, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-10", 10896, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-11", "UTF-8", 11392, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-11", 11992, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-13", "UTF-8", 12516, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-13", 13192, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-14", "UTF-8", 13716, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-14", 14452, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("ISO-8859-15", "UTF-8", 14976, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "ISO-8859-15", 15360, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("WINDOWS-874", "UTF-8", 15764, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "WINDOWS-874", 15928, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("WINDOWS-1250", "UTF-8", 16436, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "WINDOWS-1250", 16992, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("WINDOWS-1251", "UTF-8", 17516, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "WINDOWS-1251", 18152, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("WINDOWS-1252", "UTF-8", 18660, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "WINDOWS-1252", 18960, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("WINDOWS-1253", "UTF-8", 19420, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "WINDOWS-1253", 19932, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("WINDOWS-1254", "UTF-8", 20432, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "WINDOWS-1254", 20548, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("WINDOWS-1255", "UTF-8", 20984, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "WINDOWS-1255", 21756, "SingleByte", 1, 4, 3, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("WINDOWS-1256", "UTF-8", 22280, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "WINDOWS-1256", 23024, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("WINDOWS-1257", "UTF-8", 23504, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "WINDOWS-1257", 23724, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM437", "UTF-8", 24248, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM437", 25084, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM775", "UTF-8", 25608, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM775", 26252, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM737", "UTF-8", 26776, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM737", 27288, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM852", "UTF-8", 27812, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM852", 28428, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM855", "UTF-8", 28952, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM855", 29504, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM857", "UTF-8", 30020, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM857", 30532, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM860", "UTF-8", 31056, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM860", 31444, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM861", "UTF-8", 31968, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM861", 32280, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM862", "UTF-8", 32804, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM862", 33048, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM863", "UTF-8", 33572, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM863", 33952, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM865", "UTF-8", 34476, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM865", 34788, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM866", "UTF-8", 35312, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM866", 35768, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("IBM869", "UTF-8", 36260, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "IBM869", 36776, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("MACCROATIAN", "UTF-8", 37300, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "MACCROATIAN", 38132, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("MACCYRILLIC", "UTF-8", 38656, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "MACCYRILLIC", 39360, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("MACGREEK", "UTF-8", 39884, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "MACGREEK", 40584, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("MACICELAND", "UTF-8", 41108, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "MACICELAND", 41824, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("MACROMAN", "UTF-8", 42348, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "MACROMAN", 42832, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("MACROMANIA", "UTF-8", 43356, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "MACROMANIA", 43732, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("MACTURKISH", "UTF-8", 44252, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "MACTURKISH", 44608, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("MACUKRAINE", "UTF-8", 45132, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "MACUKRAINE", 45356, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("KOI8-U", "UTF-8", 45880, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "KOI8-U", 46664, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("KOI8-R", "UTF-8", 47188, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "KOI8-R", 47720, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("TIS-620", "UTF-8", 48084, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "TIS-620", 48128, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("CP850", "UTF-8", 48652, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "CP850", 49200, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("CP852", "UTF-8", 27812, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "CP852", 28428, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("CP855", "UTF-8", 28952, "SingleByte", 1, 1, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "CP855", 29504, "SingleByte", 1, 4, 1, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF-8", "UTF8-MAC", 4804, "Utf8Mac", 1, 4, 9, AsciiCompatibility.CONVERTER, 0),
        new GenericTranscoderEntry("UTF8-MAC", "UTF-8", 4928, "Utf8Mac", 1, 4, 10, AsciiCompatibility.ENCODER, 0),
        new GenericTranscoderEntry("UTF-16BE", "UTF-8", 188, "Utf1632", 2, 4, 4, AsciiCompatibility.DECODER, 0),
        new GenericTranscoderEntry("UTF-8", "UTF-16BE", 416, "Utf1632", 1, 4, 4, AsciiCompatibility.ENCODER, 0),
        new GenericTranscoderEntry("UTF-16LE", "UTF-8", 52, "Utf1632", 2, 4, 4, AsciiCompatibility.DECODER, 0),
        new GenericTranscoderEntry("UTF-8", "UTF-16LE", 416, "Utf1632", 1, 4, 4, AsciiCompatibility.ENCODER, 0),
        new GenericTranscoderEntry("UTF-32BE", "UTF-8", 252, "Utf1632", 4, 4, 4, AsciiCompatibility.DECODER, 0),
        new GenericTranscoderEntry("UTF-8", "UTF-32BE", 416, "Utf1632", 1, 4, 4, AsciiCompatibility.ENCODER, 0),
        new GenericTranscoderEntry("UTF-32LE", "UTF-8", 128, "Utf1632", 4, 4, 4, AsciiCompatibility.DECODER, 0),
        new GenericTranscoderEntry("UTF-8", "UTF-32LE", 416, "Utf1632", 1, 4, 4, AsciiCompatibility.ENCODER, 0),
        new GenericTranscoderEntry("UTF-16", "UTF-8", 276, "Utf1632", 2, 4, 4, AsciiCompatibility.DECODER, 1),
        new GenericTranscoderEntry("UTF-32", "UTF-8", 300, "Utf1632", 4, 4, 4, AsciiCompatibility.DECODER, 1),
        new GenericTranscoderEntry("UTF-8", "UTF-16", 416, "Utf1632", 1, 4, 4, AsciiCompatibility.ENCODER, 1),
        new GenericTranscoderEntry("UTF-8", "UTF-32", 416, "Utf1632", 1, 4, 4, AsciiCompatibility.ENCODER, 1)
    };
}