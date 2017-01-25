package com.scipionyx.butterflyeffect.ui.view;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.vaadin.server.FontAwesome;

/**
 * 
 * 
 * 
 * @author Renato Mendes
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ViewConfiguration {

	public String title() default "<TITLE_NOT_PROVIDED>";

	public String subTitle() default "<SUB_TITLE_NOT_PROVIDED>";

	public FontAwesome icon() default FontAwesome.YOUTUBE_SQUARE;

}