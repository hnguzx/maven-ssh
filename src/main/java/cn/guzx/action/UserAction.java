package cn.guzx.action;

import cn.guzx.entity.UserEntity;
import cn.guzx.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * Created by kinthon on 17-6-25.
 */

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{

    private UserEntity user;

    private UserService userService;

    public UserEntity getUser() {
        return this.user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String login() {
        System.out.println("收到请求！！！！！！！！！！！！！！！！！！！！！！！");
        user.setUsername("guzx");
        user.setPhone("13089414342");
        if(userService.login(user)) {
            Map session = ActionContext.getContext().getSession();
            session.put("user", user);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

}