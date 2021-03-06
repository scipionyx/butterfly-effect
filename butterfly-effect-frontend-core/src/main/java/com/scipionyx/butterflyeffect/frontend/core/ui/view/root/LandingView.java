package com.scipionyx.butterflyeffect.frontend.core.ui.view.root;

import com.scipionyx.butterflyeffect.frontend.core.ui.view.common.AbstractView;
import com.scipionyx.butterflyeffect.ui.view.MenuConfiguration;
import com.scipionyx.butterflyeffect.ui.view.MenuConfiguration.Position;
import com.scipionyx.butterflyeffect.ui.view.ViewConfiguration;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

/**
 * 
 * 
 * 
 * @version 0.1.0
 * @author Renato Mendes
 *
 */
@SpringComponent(value = LandingView.VIEW_NAME)
@SpringView(name = LandingView.VIEW_NAME)
@UIScope
//
@ViewConfiguration(title = "Home*")
@MenuConfiguration(position = Position.IGNORE, label = "Home", group = "", order = -1)
public class LandingView extends AbstractView {

	public static final String VIEW_NAME = "";

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
	public void doBuildWorkArea(VerticalLayout workAreaPanel) {

		Button button = new Button("Nav",
				event -> getUI().getNavigator().navigateTo("butterfly-effect-frontend-system:about"));
		workAreaPanel.addComponent(button);

	}

}
