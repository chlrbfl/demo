package com.demo.PureTicket.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSeatGrade is a Querydsl query type for SeatGrade
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSeatGrade extends EntityPathBase<SeatGrade> {

    private static final long serialVersionUID = 1251946035L;

    public static final QSeatGrade seatGrade = new QSeatGrade("seatGrade");

    public final StringPath grade_price = createString("grade_price");

    public final StringPath seat_grade = createString("seat_grade");

    public QSeatGrade(String variable) {
        super(SeatGrade.class, forVariable(variable));
    }

    public QSeatGrade(Path<? extends SeatGrade> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSeatGrade(PathMetadata metadata) {
        super(SeatGrade.class, metadata);
    }

}

