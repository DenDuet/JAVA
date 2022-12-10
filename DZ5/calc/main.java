package calc;

import calc.controller.Controller;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.io.FileInputStream;


import calc.views.ViewResult;

public class Main {
    
    public static class Log {
        public static Logger LOGGER;
        static {
            try(FileInputStream ins = new FileInputStream("calc/log.config")){ //полный путь до файла с конфигами
                LogManager.getLogManager().readConfiguration(ins);
                LOGGER = Logger.getLogger(Log.class.getName());
            }catch (Exception ignore){
                ignore.printStackTrace();
            }
        }
    }
        
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        Log.LOGGER.log(Level.INFO,"Beginning main, init controller");

        ViewResult res = new ViewResult(controller);
        Log.LOGGER.log(Level.INFO,"init controller ViewResult, running...");
        res.run();
    }
}
