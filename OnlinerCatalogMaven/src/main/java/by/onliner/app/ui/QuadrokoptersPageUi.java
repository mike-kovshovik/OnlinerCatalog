package by.onliner.app.ui;

import by.onliner.taf.elements.Checkbox;
import by.onliner.taf.elements.Element;
import by.onliner.taf.elements.Input;

public class QuadrokoptersPageUi
{
	public final Checkbox xpathForQuadroParameters = new Checkbox("//div[@id='schema-filter']//span[text()='%s']");
	public final Checkbox xpathListOfCheckboxesToCompare = new Checkbox("//div[@id='schema-products']/div[%s]//span[@class='i-checkbox__faux']");
	//public final String xpathListOfCheckboxesToCompare = "//div[@id='schema-products']/div[%s]//span[@class='i-checkbox__faux']";
	public final Input rangeOfAction = new Input("//input[@placeholder='6']");
	public final Element additionalParametersLink = new Element("//div[@class='schema-filter-additional__trigger']/a[contains(text(), 'Дополнительные параметры')]");
	public final Element foundItemsCountRecordPrototype = new Element("//div[@id='schema-filter-button']//span[contains(text(), 'Найдено %s')]");
	public final Element sortOrderIcon = new Element("//span[@class='schema-order__text']");
	public final Element sortOrderDropDowOptionCheap = new Element("//div[@id='schema-order']//span[text()='Дешевые']");
	public final Element firstPrice = new Element("//div[@id='schema-products']/div[1]//div[@class='schema-product__price']/a/span");
	public final Element secondPrice = new Element("//div[@id='schema-products']/div[2]//div[@class='schema-product__line']//a/span");
	public final Element numberOfItemsToCompare = new Element("//div[@id='compare-button-container']//a[@class='compare-button__sub compare-button__sub_main']");
	public final Element radiocontrolAirModelHeader = new Element("//h1[@class=\"schema-header__title\"]");
	
	
	

//	public final Checkbox getQuadroParametersXpath (String parameter) 
//	{
//		return new Checkbox(xpathForQuadroParameters, parameter);
//	}
	
//	public final Checkbox getCheckboxCompareListXpath (Integer parameter) 
//	{
//		return new Checkbox(xpathListOfCheckboxesToCompare, parameter);
//	}
//	

	
}
