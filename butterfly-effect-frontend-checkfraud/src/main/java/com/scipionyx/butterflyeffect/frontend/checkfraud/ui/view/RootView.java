package com.scipionyx.butterflyeffect.frontend.checkfraud.ui.view;

import com.scipionyx.butterflyeffect.frontend.core.ui.view.common.AbstractView;
import com.scipionyx.butterflyeffect.ui.view.MenuConfiguration;
import com.scipionyx.butterflyeffect.ui.view.MenuConfiguration.Position;
import com.scipionyx.butterflyeffect.ui.view.ViewConfiguration;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.VerticalLayout;

/**
 * 
 * 
 * 
 * @version 0.1.0
 * @author Renato Mendes
 *
 */
@SpringComponent(value = RootView.VIEW_NAME)
@SpringView(name = RootView.VIEW_NAME)
@UIScope
//
@ViewConfiguration(title = "Check Fraud")
@MenuConfiguration(position = Position.TOP_MAIN, label = "Check Fraud", group = "", order = 1, roles = {
		"CHECK_FRAUD" })
public class RootView extends AbstractView {

	public static final String VIEW_NAME = "butterfly-effect-frontend-checkfraud:root";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@Override
	public void doEnter(ViewChangeEvent event) {
	}

	/**
	 * 
	 */
	@Override
	public void doBuildWorkArea(VerticalLayout workAreaPanel) throws Exception {
	}

}
