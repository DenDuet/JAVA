package calc;

import calc.controller.Controller;

import calc.views.ViewResult;

public class main {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();

        ViewResult res = new ViewResult(controller);
        res.run();
    }
}
