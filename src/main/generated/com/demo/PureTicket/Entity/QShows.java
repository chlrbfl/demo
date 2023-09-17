package com.demo.PureTicket.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShows is a Querydsl query type for Shows
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShows extends EntityPathBase<Shows> {

    private static final long serialVersionUID = 1577946871L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShows shows = new QShows("shows");

    public final ListPath<Genre, QGenre> genre = this.<Genre, QGenre>createList("genre", Genre.class, QGenre.class, PathInits.DIRECT2);

    public final StringPath schedule_time = createString("schedule_time");

    public final QSeatGrade seat_grade;

    public final QSeatGrade seat_price;

    public final StringPath show_cast = createString("show_cast");

    public final QSeatGrade show_date;

    public final StringPath show_grade = createString("show_grade");

    public final StringPath show_name = createString("show_name");

    public final NumberPath<Integer> show_num = createNumber("show_num", Integer.class);

    public final DateTimePath<java.util.Date> show_period = createDateTime("show_period", java.util.Date.class);

    public final StringPath show_running_time = createString("show_running_time");

    public final StringPath show_ven = createString("show_ven");

    public QShows(String variable) {
        this(Shows.class, forVariable(variable), INITS);
    }

    public QShows(Path<? extends Shows> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShows(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShows(PathMetadata metadata, PathInits inits) {
        this(Shows.class, metadata, inits);
    }

    public QShows(Class<? extends Shows> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.seat_grade = inits.isInitialized("seat_grade") ? new QSeatGrade(forProperty("seat_grade")) : null;
        this.seat_price = inits.isInitialized("seat_price") ? new QSeatGrade(forProperty("seat_price")) : null;
        this.show_date = inits.isInitialized("show_date") ? new QSeatGrade(forProperty("show_date")) : null;
    }

}

