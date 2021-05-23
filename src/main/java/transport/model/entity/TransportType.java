package transport.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transport_type")
public class TransportType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String description;

    @OneToMany(mappedBy = "transportType", fetch = FetchType.LAZY)
    private Set<Transport> transports;

    @OneToMany(mappedBy = "type", fetch = FetchType.LAZY)
    private Set<Route> routes;
}
