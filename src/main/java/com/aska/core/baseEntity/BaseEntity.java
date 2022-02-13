package com.aska.core.baseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@SQLDelete(sql = "UPDATE table_product SET deleted = true WHERE id=?")
//@Where(clause = "deleted=false")
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="is_active")
    private boolean isActive = Boolean.TRUE;

//    @Column(name="create_date")
//    private LocalDate createDate;
//    @ManyToOne
//    @JoinColumn(name="create_user_id")
//    private User createUser;
//
//    @Column(name="cancel_date")
//    private LocalDate cancelDate;
//    @ManyToOne
//    @JoinColumn(name="cancel_user_id")
//    private User cancelUer;
}
