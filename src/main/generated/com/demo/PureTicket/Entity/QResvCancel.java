package com.demo.PureTicket.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QResvCancel is a Querydsl query type for ResvCancel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QResvCancel extends EntityPathBase<ResvCancel> {

    private static final long serialVersionUID = -991840081L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QResvCancel resvCancel = new QResvCancel("resvCancel");

    public final NumberPath<Integer> cancel_money = createNumber("cancel_money", Integer.class);

    public final QResvHistory pay_num;

    public final QResvHistory resv_num;

    public QResvCancel(String variable) {
        this(ResvCancel.class, forVariable(variable), INITS);
    }

    public QResvCancel(Path<? extends ResvCancel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QResvCancel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QResvCancel(PathMetadata metadata, PathInits inits) {
        this(ResvCancel.class, metadata, inits);
    }

    public QResvCancel(Class<? extends ResvCancel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pay_num = inits.isInitialized("pay_num") ? new QResvHistory(forProperty("pay_num"), inits.get("pay_num")) : null;
        this.resv_num = inits.isInitialized("resv_num") ? new QResvHistory(forProperty("resv_num"), inits.get("resv_num")) : null;
    }

}

