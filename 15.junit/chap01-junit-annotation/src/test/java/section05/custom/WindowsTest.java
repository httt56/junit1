package section05.custom;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 생명주기 runtime : 프로그램 종료시까지 class: 컴파일 시점까지 , source
@Target(ElementType.METHOD) //해당어노테이션 지정할 위치 설정함
@EnabledOnOs(OS.WINDOWS)
@EnabledOnJre(value = JRE.JAVA_8)
@Test
public @interface WindowsTest {
}
