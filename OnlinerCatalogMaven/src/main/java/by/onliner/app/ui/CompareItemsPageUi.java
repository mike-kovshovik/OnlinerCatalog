package by.onliner.app.ui;

import by.onliner.taf.elements.Element;
import by.onliner.taf.elements.Input;

public class CompareItemsPageUi
{	
	//public final Element comparisonTableItemPrototype = new Element("//th[@class='product-table__cell'][%s]");
	public final Element comparisonTableItemPrototype = new Element("//th[@class='product-table__cell'][3]/div[@class='product-table-cell-container']/div[@class='product-summary']/a");
	
	public final Input textField = new Input("//input[@class='product-table']");
}
