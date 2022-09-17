package me.whiteship.inflearnthejavatest.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class StudyTest {
    
    @Test
    void init1() {
        assumeTrue(true);
    }
    
    @Test
    void init2() {
        assumeTrue(false);
    }
    
    @Test
    void create() {
        assumingThat(true, () -> assertThat(1).isEqualTo(1));
        assumingThat(false, () -> assertThat(1).isEqualTo(2));
    }
    
    @Test
    @EnabledOnOs({OS.MAC, OS.LINUX})
    void create01() {
        assertThat(1).isEqualTo(2);
    }
    
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void create02() {
        assertThat(1).isEqualTo(1);
    }
    
    @Test
    @DisabledOnOs(OS.WINDOWS)
    void create03() {
        assertThat(1).isEqualTo(2);
    }
    
    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void create04() {
        assertThat(1).isEqualTo(1);
    }
    
    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void create05() {
        assertThat(1).isEqualTo(1);
    }
    
    @Test
    @DisplayName("태그 : fast")
    @Tag("fast")
    void create06() {
        assertThat(1).isEqualTo(1);
    }
    
    @Test
    @DisplayName("태그 : slow")
    @Tag("slow")
    void create07() {
        assertThat(1).isEqualTo(1);
    }
    
    @FastTest
    @DisplayName("메타 애노테이션 : fast")
    void create08() {
        assertThat(1).isEqualTo(1);
    }
    
    @SlowTest
    @DisplayName("메타 애노테이션 : slow")
    void create09() {
        assertThat(1).isEqualTo(1);
    }
}
