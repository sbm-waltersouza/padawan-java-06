@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        return "error"; // Nome do arquivo template para a página de erro
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
