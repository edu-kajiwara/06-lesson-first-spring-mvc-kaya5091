package tama.ac.jp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by YK on 2017/05/30.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Password {
    private String user_id;
    private String user_password;
}
