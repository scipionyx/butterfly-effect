package com.scipionyx.butterflyeffect.frontend.core.ui.view.panel.top;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.scipionyx.butterflyeffect.frontend.core.services.UserMenuService;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.VaadinSessionScope;
import com.vaadin.ui.Component;

/**
 *
 * It has to be a factory, dont try to change it, Vaadin can not reuse
 * components between views.
 * 
 * 
 * @author Renato Mendes
 *
 */
@SpringComponent()
@VaadinSessionScope
public class TopFactory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserMenuService userMenuService;

	/**
	 * 
	 * @return
	 */
	public Component instance() {
		TopMenuPanel topMenuPanel = new TopMenuPanel();
		topMenuPanel.build(userMenuService);
		return topMenuPanel;
	}

}
