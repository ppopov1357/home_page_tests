package eu.strypes.tests;

import eu.strypes.base.BaseTest;
import eu.strypes.questions.PageTitle;
import eu.strypes.tasks.UseNavigation;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;

/**
 * Test the navigation in the Strypes website
 * Test the case when the navigation has a sub menu with options
 */
@RunWith(SerenityParameterizedRunner.class)
public class Navigation extends BaseTest {

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
            {"About", "Our Clients", "Our Clients"},
            {"Services", "Our Services", "Our Services"},
            {"Careers", "Vacancies", "Vacancies"}
            // Other navigation test data goes here
        });
    }

    private final String parentItemName;
    private final String childItemName;
    private final String expectedPageTitle;


    public Navigation(String parentItemName, String childItemName, String expectedPageTitle) {
        this.parentItemName = parentItemName;
        this.childItemName = childItemName;
        this.expectedPageTitle = expectedPageTitle;
    }


    @Test
    public void navigationTest() {
        when(peter).attemptsTo(UseNavigation.from(parentItemName).to(childItemName));
        then(peter).should(seeThat(PageTitle.get(), equalTo(expectedPageTitle)));
    }
}
