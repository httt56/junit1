package section04.enviroment;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class EnvAnnotationTests {
    @Test
    @EnabledOnOs(value = OS.WINDOWS, disabledReason = "윈도우에서 테스트")
    void winTest() {
        System.out.println("윈도우에서만 되지롱롱~...");
    }

    @Test
    @EnabledOnOs(value = OS.MAC, disabledReason = "맥에서 테스트")
    void macTest() {
        System.out.println("맥에서만 되지롱롱~...");
    }

    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "윈도우에서는 테스트를 무시할게요")
    void winDisabledTest() {
        System.out.println("여기도 맥에서만 되지롱~...");
    }
    //jar(java) 환경 테스트
    @Test
    @EnabledOnJre(value = JRE.JAVA_8, disabledReason = "jre8에서만 실행되지롱")
    void jre8_test() {
        System.out.println("여기는 11버전이라 안되지롱~!...");
    }

    @Test
    @EnabledOnJre(value = JRE.JAVA_11, disabledReason = "jre11에서만 실행되지롱")
    void jre11_test() {
        System.out.println("여기는 11버전이라 되지롱~!... 테스트 좀 할게요~");
    }
    @Test
    @EnabledOnJre(value = {JRE.JAVA_11, JRE.JAVA_8}, disabledReason = "jre11 또는 8에서 실행되지롱")
    void jre11_AND_8_test() {
        System.out.println("8또는 11에서 테스트 좀 할게요~");
    }

    @Test
    @DisabledOnJre(value = JRE.JAVA_11, disabledReason = "jre 11에서는 안할게요...")
    void jre11_disabled() {
        System.out.println("11에서는 테스트 안할게요...");
    }

    @Test
    @DisabledOnJre(value = JRE.JAVA_8, disabledReason = "jre 8에서는 안할게요...")
    void jre8_disabled() {
        System.out.println("8에서는 테스트 안할게요...");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    void jre_8range_11(){
        System.out.println("8에서 11사이 테스트");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    void jre_8_range_11(){
        System.out.println("8에서 11사이 테스트 제외");
    }



}
