package bo;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public enum LoginResultEnum {
    WELCOME("WELCOME :)"),
    ACCESS_DENIED("ACCESS DENIED!"),
    COOKIE_MISSING("THE SESSION COOKIE IS MISSING OR HAS A WRONG VALUE!"),
    REDIRECTING("REDIRECTING...");

    private String value;

    LoginResultEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static LoginResultEnum findMessageByValue(String valueSearch){
        List<LoginResultEnum> list = Arrays.asList(LoginResultEnum.values());
        for (LoginResultEnum enumEntry : list){
            if(StringUtils.equals(enumEntry.getValue(), valueSearch)){
                return enumEntry;
            }
        }
        return null;
    }
}
