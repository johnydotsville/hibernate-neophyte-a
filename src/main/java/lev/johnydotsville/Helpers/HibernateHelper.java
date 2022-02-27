package lev.johnydotsville.Helpers;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.cfg.Environment;

import lev.johnydotsville.Entities.Actor;

public class HibernateHelper {
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();

                Map<String, Object> settings = new HashMap<>();
                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/sakila");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "j123");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");

                builder.applySettings(settings);

                registry = builder.build();

                MetadataSources sources = new MetadataSources(registry);

                sources.addAnnotatedClass(Actor.class);

                Metadata metadata = sources.getMetadataBuilder().build();

                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception ex) {
                ex.printStackTrace();
                if (registry != null)
                    StandardServiceRegistryBuilder.destroy(registry);
            }
        }
        return sessionFactory;
    }

    public static void close() {
        if (registry != null)
            StandardServiceRegistryBuilder.destroy(registry);
    }
}
