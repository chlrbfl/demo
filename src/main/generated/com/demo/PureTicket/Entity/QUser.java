package com.demo.PureTicket.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -226123318L;

    public static final QUser user = new QUser("user");

    public final ListPath<Genre, QGenre> genre = this.<Genre, QGenre>createList("genre", Genre.class, QGenre.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Pay, QPay> pay = this.<Pay, QPay>createList("pay", Pay.class, QPay.class, PathInits.DIRECT2);

    public final ListPath<Qna, QQna> qna = this.<Qna, QQna>createList("qna", Qna.class, QQna.class, PathInits.DIRECT2);

    public final ListPath<ResvHistory, QResvHistory> resvnum = this.<ResvHistory, QResvHistory>createList("resvnum", ResvHistory.class, QResvHistory.class, PathInits.DIRECT2);

    public final DatePath<java.time.LocalDate> sub_date = createDate("sub_date", java.time.LocalDate.class);

    public final DateTimePath<java.util.Date> user_birth = createDateTime("user_birth", java.util.Date.class);

    public final StringPath user_email = createString("user_email");

    public final NumberPath<Long> user_id = createNumber("user_id", Long.class);

    public final StringPath user_name = createString("user_name");

    public final StringPath user_pass = createString("user_pass");

    public final StringPath user_phone = createString("user_phone");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

