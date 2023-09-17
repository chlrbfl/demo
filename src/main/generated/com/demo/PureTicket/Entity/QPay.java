package com.demo.PureTicket.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPay is a Querydsl query type for Pay
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPay extends EntityPathBase<Pay> {

    private static final long serialVersionUID = 269795017L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPay pay = new QPay("pay");

    public final QResvHistory id;

    public final DateTimePath<java.util.Date> pay_date = createDateTime("pay_date", java.util.Date.class);

    public final StringPath pay_method = createString("pay_method");

    public final NumberPath<Integer> pay_num = createNumber("pay_num", Integer.class);

    public final NumberPath<Integer> pay_price = createNumber("pay_price", Integer.class);

    public final StringPath pay_state = createString("pay_state");

    public QPay(String variable) {
        this(Pay.class, forVariable(variable), INITS);
    }

    public QPay(Path<? extends Pay> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPay(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPay(PathMetadata metadata, PathInits inits) {
        this(Pay.class, metadata, inits);
    }

    public QPay(Class<? extends Pay> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QResvHistory(forProperty("id"), inits.get("id")) : null;
    }

}

