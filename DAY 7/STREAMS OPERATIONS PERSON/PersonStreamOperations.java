package com.demo.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * This class has various methods to do stream operations on person collection
 */
public class PersonStreamOperations {

    /**
     * sorts the person list alphabetically in uppercase
     * Returns Empty Optional if the given list is null or empty
     *
     * @param personList
     * @return
     */
    public Optional<List<String>> getPersonListSortedByNameInUpperCase(List<String> personList) {
        return null;
    }

    /**
     * Sorts the distinct person names in descending order
     * Returns empty set if the given list is empty or null
     *
     * @param personList
     * @return
     */

    public Set<String> getDistinctPersonNamesSortedInDescendingOrder(List<String> personList) {
        return null;
    }

    /**
     * Returns "Person found" if the person searched is available in the list or else returns "Person not found"
     * Returns "Give proper input not null" if the given list or name to search is null
     *
     * @param personList
     * @return
     */
    public boolean searchPerson(List<String> personList, String nameToSearch) {
        return false;
    }

    /**
     * Filters the list whose name length is greater than five and sorts by name length
     * Returns empty list if the given list is empty or null
     *
     * @param personList
     * @return
     */

    public List<String> getPersonListSortedByLengthWithNameLengthGreaterThanFive(List<String> personList) {
        return null;
    }

    /**
     * Returns the person name having maximum age from the given Map<String,Integer> having name as key and age as value
     * Returns "Give proper input not null" if the given map is empty or null
     *
     * @param personMap
     * @return
     */

    public String getPersonByMaxAge(Map<String, Integer> personMap) {
        return null;
    }

}
