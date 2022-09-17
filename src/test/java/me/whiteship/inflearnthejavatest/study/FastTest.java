package me.whiteship.inflearnthejavatest.study;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD) // 메서드에 쓸 수 있도록
@Retention(RetentionPolicy.RUNTIME) // 이 애노테이션 정보를 런타임까지 유지
@Test
@Tag("fast")
public @interface FastTest {
    // Test, Tag 를 한번에 붙일 수 있는 메타 애노테이션 생성
}

