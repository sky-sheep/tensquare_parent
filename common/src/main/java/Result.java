import lombok.Data;

@Data
public class Result {

    /**
     * 标志位
     */
    private boolean flag;
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 消息类型
     */
    private String message;
    /**
     * 数据类型
     */
    private Object data;

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}
