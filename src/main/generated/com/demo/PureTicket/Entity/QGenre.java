package com.demo.PureTicket.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGenre is a Querydsl query type for Genre
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGenre extends EntityPathBase<Genre> {

    private static final long serialVersionUID = 1566774116L;

    public static final QGenre genre = new QGenre("genre");

    public final NumberPath<Integer> post_num = createNumber("post_num", Integer.class);

    public QGenre(String variable) {
        super(Genre.class, forVariable(variable));
    }

    public QGenre(Path<? extends Genre> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGenre(PathMetadata metadata) {
        super(Genre.class, metadata);
    }

}

