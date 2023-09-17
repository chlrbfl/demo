package com.demo.PureTicket.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQna is a Querydsl query type for Qna
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQna extends EntityPathBase<Qna> {

    private static final long serialVersionUID = 269796357L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQna qna = new QQna("qna");

    public final QQna answer_num;

    public final QUser id;

    public final StringPath qna_content = createString("qna_content");

    public final DateTimePath<java.util.Date> qna_date = createDateTime("qna_date", java.util.Date.class);

    public final NumberPath<Integer> qna_num = createNumber("qna_num", Integer.class);

    public final StringPath qna_title = createString("qna_title");

    public final QResvHistory resv_num;

    public QQna(String variable) {
        this(Qna.class, forVariable(variable), INITS);
    }

    public QQna(Path<? extends Qna> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQna(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQna(PathMetadata metadata, PathInits inits) {
        this(Qna.class, metadata, inits);
    }

    public QQna(Class<? extends Qna> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.answer_num = inits.isInitialized("answer_num") ? new QQna(forProperty("answer_num"), inits.get("answer_num")) : null;
        this.id = inits.isInitialized("id") ? new QUser(forProperty("id")) : null;
        this.resv_num = inits.isInitialized("resv_num") ? new QResvHistory(forProperty("resv_num"), inits.get("resv_num")) : null;
    }

}

