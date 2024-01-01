package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Delivery extends BaseEntity{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private String city;
    //private String street;
    //private String zipcode;
    @Embedded
    private Address address;

    private DeliveryStatus status;

    @OneToOne(fetch = LAZY, mappedBy = "delivery")
    private Order order;
}
