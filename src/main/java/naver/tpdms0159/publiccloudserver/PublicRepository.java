package naver.tpdms0159.publiccloudserver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicRepository extends JpaRepository<User, String> {
}