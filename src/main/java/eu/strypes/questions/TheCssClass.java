package eu.strypes.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;

@Subject("the #target css class '#targetCssClass' is present:")
public class TheCssClass implements Question<Boolean> {
    private Target target;
    private String targetCssClass;

    public static TheCssClassQuestionBuilder of(Target target) {
        return new TheCssClassQuestionBuilder(target);
    }

    public TheCssClass(Target target, String targetCssClass) {
        this.target = target;
        this.targetCssClass = targetCssClass;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String classAttribute = target.resolveFor(actor).getAttribute("class");
        return Arrays.asList(classAttribute.split(" ")).contains(targetCssClass);
    }

    public static class TheCssClassQuestionBuilder {
        private Target target;
        private String cssClass;

        public TheCssClassQuestionBuilder(Target target) {
            this.target = target;
        }

        public TheCssClassQuestionBuilder named(String cssClass) {
            this.cssClass = cssClass;
            return this;
        }

        public TheCssClass isPresent() {
            return new TheCssClass(this.target, this.cssClass);
        }
    }
}
