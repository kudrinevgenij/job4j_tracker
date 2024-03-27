package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int score = 0;
        int numberOfSubjects = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            numberOfSubjects += pupil.subjects().size();
        }
        return (double) score / numberOfSubjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            labels.add(new Label(pupil.name(), (double) score / pupil.subjects().size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> temp = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.merge(subject.name(), subject.score(), (oldValue, newValue) -> temp.get(subject.name()) + newValue);
            }
        }
        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            labels.add(new Label(entry.getKey(), (double) entry.getValue() / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int score = 0;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            labels.add(new Label(pupil.name(), score));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.merge(subject.name(), subject.score(), (oldValue, newValue) -> temp.get(subject.name()) + newValue);
            }
        }
        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            labels.add(new Label(entry.getKey(), entry.getValue()));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}