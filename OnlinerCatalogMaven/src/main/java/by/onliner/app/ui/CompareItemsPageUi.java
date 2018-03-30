package by.onliner.app.ui;

import by.onliner.taf.elements.Element;
import by.onliner.taf.elements.Input;

public class CompareItemsPageUi
{	
	public final Element comparisonTableItemPrototype = new Element("//th[@class='product-table__cell'][%s]");
	public final Input textField = new Input("//input[@class='product-table']");
}
