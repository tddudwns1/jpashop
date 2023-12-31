package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    //@Column(name = "ORDER_ID")
    //private Long orderId;
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    //@Column(name = "ITEM_ID")
    //private Long itemId;
    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;


    private int orderPrice;
    private int count;
}
