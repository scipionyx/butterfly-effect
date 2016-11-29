package com.scipionyx.butterflyeffect.frontend.core.ui.view.panel.top;

import java.util.List;

import org.vaadin.teemu.VaadinIcons;

import com.scipionyx.butterflyeffect.frontend.core.services.UserMenuService;
import com.scipionyx.butterflyeffect.frontend.model.Menu;
import com.vaadin.server.Resource;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.themes.ValoTheme;

/**
 * 
 * @author Renato Mendes
 *
 */
public class TopMenuRight extends MenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param menu
	 * @param userMenuService
	 * 
	 */
	public void build(Menu menu, UserMenuService userMenuService) {

		this.addStyleName(ValoTheme.MENUBAR_BORDERLESS);

		List<Menu> list = userMenuService.getMenus();
		MenuItem root = addRoot(menu, list);
		addChildren(root, menu, list);
	}

	private MenuItem addRoot(Menu menu, List<Menu> list) {

		Command command = null;

		if (menu.getView() != null) {
			command = new Command() {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public void menuSelected(MenuItem selectedItem) {
					getUI().getNavigator().navigateTo(menu.getView());
				}
			};
		}

		Resource resource = VaadinIcons.ABACUS;

		MenuItem root = this.addItem(menu.getLabel(), resource, command);

		for (Menu menuL2 : list) {
			if (menuL2.getParent() != null && menuL2.getParent().equals(menu.getId())) {
				addChildren(root, menuL2, list);
			}
		}

		return root;

	}

	/**
	 * @param root
	 * 
	 */
	private void addChildren(MenuItem root, Menu menu, List<Menu> list) {

		MenuItem item = root.addItem(menu.getLabel(), new Command() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void menuSelected(MenuItem selectedItem) {
				getUI().getNavigator().navigateTo(menu.getView());
			}
		});

		for (Menu menuL2 : list) {
			if (menuL2.getParent() != null && menuL2.getParent().equals(menu.getId())) {
				addChildren(item, menuL2, list);
			}
		}

	}

}
