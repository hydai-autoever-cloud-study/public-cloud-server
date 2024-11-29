package naver.tpdms0159.publiccloudserver;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String nickname;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
