package by.onliner.app.ui;

import by.onliner.taf.elements.Element;
import by.onliner.taf.elements.Input;

public class CompareItemsPageUi
{	
	public final String comparisonTableItemPrototype = "//th[@class='product-table__cell'][%s]";
	public final Input textField = new Input("//input[@class='product-table']");
	
	public final Element getComparisonTableItemXpath(String parameter)
	{
		return new Element(comparisonTableItemPrototype, parameter);
	}
}
