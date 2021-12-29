import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.junit.*;

import play.mvc.*;
import plau.test.*;
import play.data.DynamicForm;
import play.data.validationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
public class ApplicationTest {

    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }

    @Test
    public void renderTemplate() {
        Content html = views.html.index.render("何か書いて。", new play.data.Form(controllers.Application.SampleForm.class));
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThaat(contentAsString(html)).contains("何か書いて。");
    }
}