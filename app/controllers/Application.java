package controllers;

import play.*;
import play.data.*;
import static play.data.Form.*;
import play.mvc.*;

import views.html.*;


public class Application extends Controller {

    // Form用の内部クラス
    public static class SampleForm {
        public String message;
    }

    // ルートにアクセスした際のAction
    public Result index() {
        return ok(index.render("何か書いて。"));
    }


}
