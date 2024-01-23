package com.accenture.academy.parish;

import com.accenture.academy.church.ChurchDao;
import com.accenture.academy.member.MemberDao;
import com.accenture.academy.priest.PriestDao;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@Table(name = "parish")
@NoArgsConstructor
public class ParishDao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private PriestDao priestDao;
    @OneToOne(cascade = CascadeType.ALL)
    private ChurchDao churchDao;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "parish_id")
    private Set<MemberDao> members;

    public ParishDao(PriestDao priestDao, ChurchDao churchDao, Set<MemberDao> members) {
        this.priestDao = priestDao;
        this.churchDao = churchDao;
        this.members = members;
    }
}
