@Controller
public class UserController {

    // �α��� �������� �̵�
    @RequestMapping("/user/login.do")
    public String login() {
        logger.info("��� : login");
        
        return "user/login";
    }

    // ȸ������ �������� �̵�
    @RequestMapping("/user/insert.do")
    public String insert() {
        logger.info("��� : insert");
        
        return "user/insert";
    }

   // ȸ������ �������� �̵�
    @RequestMapping("/user/update.do")
    public String update() {
        logger.info("��� : update");
        
        return "user/update";
    }

    // ȸ������ �������� �̵�
    @RequestMapping("/user/delete.do")
    public String delete() {
        logger.info("��� : delete");
        
        return "user/delete";
    }
}