package com.product.ecommerce.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Products",schema="ecommerce",
        uniqueConstraints={
                @UniqueConstraint(
                        name="name",
                        columnNames="Name")
        }
)
@Entity
@Data
//	@Getter
//	@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    @CreationTimestamp
    //private LocalDateTime createdAt;
    @UpdateTimestamp
    //private LocalDateTime lastUpdated;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
//		public LocalDateTime getCreatedAt() {
//			return createdAt;
//		}
//		public void setCreatedAt(LocalDateTime createdAt) {
//			this.createdAt = createdAt;
//		}
//		public LocalDateTime getLastUpdated() {
//			return lastUpdated;
//		}
//		public void setLastUpdated(LocalDateTime lastUpdated) {
//			this.lastUpdated = lastUpdated;
//		}


}