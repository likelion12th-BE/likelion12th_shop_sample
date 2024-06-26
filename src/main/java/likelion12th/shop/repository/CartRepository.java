package likelion12th.shop.repository;

import likelion12th.shop.entity.Cart;
import likelion12th.shop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByMember(Member member);
}
