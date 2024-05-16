package org.sparta.springprepare;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor // 모든 필드들을 가지고 있는 생성자를 만들어줌.
@NoArgsConstructor // 기본 생성자
@RequiredArgsConstructor // final이 필요. final이 달린 생성자를 만들어줌.
public class Memo {
    private String username;
    private String contents;

//    public Memo(String username, String contents) {
//        this.username = username;
//        this.contents = contents;
//    }
}
