package com.demo.PureTicket.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAnswer is a Querydsl query type for Answer
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAnswer extends EntityPathBase<Answer> {

    private static final long serialVersionUID = 1162047997L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAnswer answer = new QAnswer("answer");

    public final ArrayPath<byte[], Byte> answer_content = createArray("answer_content", byte[].class);

    public final DateTimePath<java.util.Date> answer_date = createDateTime("answer_date", java.util.Date.class);

    public final NumberPath<Integer> answer_num = createNumber("answer_num", Integer.class);

    public final StringPath answer_state = createString("answer_state");

    public final StringPath answer_title = createString("answer_title");

    public final QQna qna_num;

    public QAnswer(String variable) {
        this(Answer.class, forVariable(variable), INITS);
    }

    public QAnswer(Path<? extends Answer> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAnswer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAnswer(PathMetadata metadata, PathInits inits) {
        this(Answer.class, metadata, inits);
    }

    public QAnswer(Class<? extends Answer> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.qna_num = inits.isInitialized("qna_num") ? new QQna(forProperty("qna_num"), inits.get("qna_num")) : null;
    }

}

