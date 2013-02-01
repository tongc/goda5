
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocaleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocaleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="en_US"/>
 *     &lt;enumeration value="en_GB"/>
 *     &lt;enumeration value="ar_SA"/>
 *     &lt;enumeration value="cz_CS"/>
 *     &lt;enumeration value="da_DK"/>
 *     &lt;enumeration value="de_DE"/>
 *     &lt;enumeration value="el_GR"/>
 *     &lt;enumeration value="es_ES"/>
 *     &lt;enumeration value="et_EE"/>
 *     &lt;enumeration value="fi_FI"/>
 *     &lt;enumeration value="fr_FR"/>
 *     &lt;enumeration value="fr_CA"/>
 *     &lt;enumeration value="hu_HU"/>
 *     &lt;enumeration value="hr_HR"/>
 *     &lt;enumeration value="in_ID"/>
 *     &lt;enumeration value="is_IS"/>
 *     &lt;enumeration value="it_IT"/>
 *     &lt;enumeration value="ja_JP"/>
 *     &lt;enumeration value="ko_KR"/>
 *     &lt;enumeration value="ms_MY"/>
 *     &lt;enumeration value="lv_LV"/>
 *     &lt;enumeration value="lt_LT"/>
 *     &lt;enumeration value="nl_NL"/>
 *     &lt;enumeration value="no_NO"/>
 *     &lt;enumeration value="pl_PL"/>
 *     &lt;enumeration value="pt_BR"/>
 *     &lt;enumeration value="pt_PT"/>
 *     &lt;enumeration value="ru_RU"/>
 *     &lt;enumeration value="sv_SE"/>
 *     &lt;enumeration value="sk_SK"/>
 *     &lt;enumeration value="th_TH"/>
 *     &lt;enumeration value="tr_TR"/>
 *     &lt;enumeration value="uk_UA"/>
 *     &lt;enumeration value="vi_VN"/>
 *     &lt;enumeration value="zh_TW"/>
 *     &lt;enumeration value="zh_CN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocaleType")
@XmlEnum
public enum LocaleType {

    @XmlEnumValue("en_US")
    EN_US("en_US"),
    @XmlEnumValue("en_GB")
    EN_GB("en_GB"),
    @XmlEnumValue("ar_SA")
    AR_SA("ar_SA"),
    @XmlEnumValue("cz_CS")
    CZ_CS("cz_CS"),
    @XmlEnumValue("da_DK")
    DA_DK("da_DK"),
    @XmlEnumValue("de_DE")
    DE_DE("de_DE"),
    @XmlEnumValue("el_GR")
    EL_GR("el_GR"),
    @XmlEnumValue("es_ES")
    ES_ES("es_ES"),
    @XmlEnumValue("et_EE")
    ET_EE("et_EE"),
    @XmlEnumValue("fi_FI")
    FI_FI("fi_FI"),
    @XmlEnumValue("fr_FR")
    FR_FR("fr_FR"),
    @XmlEnumValue("fr_CA")
    FR_CA("fr_CA"),
    @XmlEnumValue("hu_HU")
    HU_HU("hu_HU"),
    @XmlEnumValue("hr_HR")
    HR_HR("hr_HR"),
    @XmlEnumValue("in_ID")
    IN_ID("in_ID"),
    @XmlEnumValue("is_IS")
    IS_IS("is_IS"),
    @XmlEnumValue("it_IT")
    IT_IT("it_IT"),
    @XmlEnumValue("ja_JP")
    JA_JP("ja_JP"),
    @XmlEnumValue("ko_KR")
    KO_KR("ko_KR"),
    @XmlEnumValue("ms_MY")
    MS_MY("ms_MY"),
    @XmlEnumValue("lv_LV")
    LV_LV("lv_LV"),
    @XmlEnumValue("lt_LT")
    LT_LT("lt_LT"),
    @XmlEnumValue("nl_NL")
    NL_NL("nl_NL"),
    @XmlEnumValue("no_NO")
    NO_NO("no_NO"),
    @XmlEnumValue("pl_PL")
    PL_PL("pl_PL"),
    @XmlEnumValue("pt_BR")
    PT_BR("pt_BR"),
    @XmlEnumValue("pt_PT")
    PT_PT("pt_PT"),
    @XmlEnumValue("ru_RU")
    RU_RU("ru_RU"),
    @XmlEnumValue("sv_SE")
    SV_SE("sv_SE"),
    @XmlEnumValue("sk_SK")
    SK_SK("sk_SK"),
    @XmlEnumValue("th_TH")
    TH_TH("th_TH"),
    @XmlEnumValue("tr_TR")
    TR_TR("tr_TR"),
    @XmlEnumValue("uk_UA")
    UK_UA("uk_UA"),
    @XmlEnumValue("vi_VN")
    VI_VN("vi_VN"),
    @XmlEnumValue("zh_TW")
    ZH_TW("zh_TW"),
    @XmlEnumValue("zh_CN")
    ZH_CN("zh_CN");
    private final String value;

    LocaleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocaleType fromValue(String v) {
        for (LocaleType c: LocaleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
