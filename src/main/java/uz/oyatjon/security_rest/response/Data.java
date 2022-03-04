package uz.oyatjon.security_rest.response;

import lombok.Getter;
import lombok.Setter;

/**
 * @author johnl
 * @since 2/24/2022
 */

@Getter
public class Data<T> {

    private Integer totalCount;
    private final T body;

    public Data(T body) {
        this.body = body;
    }

    public Data(Integer totalCount, T body) {
        this.totalCount = totalCount;
        this.body = body;
    }

}
