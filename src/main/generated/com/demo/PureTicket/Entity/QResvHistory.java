package com.demo.PureTicket.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QResvHistory is a Querydsl query type for ResvHistory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QResvHistory extends EntityPathBase<ResvHistory> {

    private static final long serialVersionUID = -305553153L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QResvHistory resvHistory = new QResvHistory("resvHistory");

    public final QUser id;

    public final QPay pay_date;

    public final QPay pay_state;

    public final DateTimePath<java.util.Date> resv_date = createDateTime("resv_date", java.util.Date.class);

    public final StringPath resv_num = createString("resv_num");

    public final StringPath resv_seat = createString("resv_seat");

    public final NumberPath<Integer> ticket_count = createNumber("ticket_count", Integer.class);

    public final NumberPath<Integer> ticket_price = createNumber("ticket_price", Integer.class);

    public QResvHistory(String variable) {
        this(ResvHistory.class, forVariable(variable), INITS);
    }

    public QResvHistory(Path<? extends ResvHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QResvHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QResvHistory(PathMetadata metadata, PathInits inits) {
        this(ResvHistory.class, metadata, inits);
    }

    public QResvHistory(Class<? extends ResvHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QUser(forProperty("id")) : null;
        this.pay_date = inits.isInitialized("pay_date") ? new QPay(forProperty("pay_date"), inits.get("pay_date")) : null;
        this.pay_state = inits.isInitialized("pay_state") ? new QPay(forProperty("pay_state"), inits.get("pay_state")) : null;
    }

}

