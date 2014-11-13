package com.synisys.training.patterns.abstractfactory.builder.byEffectiveJava;

import com.sun.javafx.scene.layout.region.BackgroundImage;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Anania.Mikaelyan
 * @since 11/3/2014
 */
public class Project {
    private Integer id;
    private String title;
    private String description;
    private String notes;
    private Date startDate;
    private Date endDate;
    private BigDecimal totalCost;
    private BigDecimal totalCommitment;
    private BigDecimal totalDisbursement;
    private BigDecimal totalExpenditures;

    public static class Builder {
        //required
        private Integer id;
        private String title;
        //optional
        private String description = "";
        private String notes = "";
        private Date startDate = new Date();
        private Date endDate = new Date();
        private BigDecimal totalCost = BigDecimal.ZERO;
        private BigDecimal totalCommitment = BigDecimal.ZERO;
        private BigDecimal totalDisbursement = BigDecimal.ZERO;
        private BigDecimal totalExpenditures = BigDecimal.ZERO;


        public Builder(Integer id, String title) {
            this.id = id;
            this.title = title;
        }
        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder notes(String notes){
            this.notes = notes;
            return this;
        }
        public Builder startDate(Date startDate){
            this.startDate = startDate;
            return this;
        }
        public Builder endDate(Date endDate){
            this.endDate = endDate;
            return this;
        }
        public Builder totalCost(BigDecimal totalCost){
            this.totalCost = totalCost;
            return this;
        }
        public Builder totalCommitment(BigDecimal totalCommitment){
            this.totalCommitment = totalCommitment;
            return this;
        }
        public Builder totalDisbursement(BigDecimal totalDisbursement){
            this.totalDisbursement = totalDisbursement;
            return this;
        }
        public Builder totalExpenditures(BigDecimal totalExpenditures){
            this.totalExpenditures = totalExpenditures;
            return this;
        }

        public Project build(){
            return new Project(this);
        }
    }
    private Project(Builder builder){
        id=builder.id;
        title = builder.title;
        description = builder.description;
        notes = builder.notes;
        startDate = builder.startDate;
        endDate = builder.endDate;
        totalCost = builder.totalCost;
        totalCommitment = builder.totalCommitment;
        totalDisbursement= builder.totalDisbursement;
        totalExpenditures = builder.totalExpenditures;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", notes='" + notes + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalCost=" + totalCost +
                ", totalCommitment=" + totalCommitment +
                ", totalDisbursement=" + totalDisbursement +
                ", totalExpenditures=" + totalExpenditures +
                '}';
    }
}
