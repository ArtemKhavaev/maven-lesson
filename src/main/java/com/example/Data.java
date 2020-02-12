package com.example;

/**
 * Класс com.example.Data с полями name, code
 * @author artem
 * @version 1.0
 */
public class Data {
    /**
     * поле имя
     */
    private String name;
    /**
     * поле имя
     */
    private String code;
    /**
     * конструктор для создания нового объекта
     * @param name -значение для имени
     * @param code -значение для кода
     * @see Data#Data(String, String)
     *
     */
    public Data(String name, String code) {
        this.name = name;
        this.code = code;
    }

    /** метод получения значения поля {@link Data#name}
     * @return возвращает имя
     */

    public String getName() {
        return name;
    }

    /** метод установки значения поля {@link Data#name}
     * @param name -название
     */

    public void setName(String name) {
        this.name = name;
    }

    /** метод получения значения поля {@link Data#code}
     * @return возвращает код
     */

    public String getCode() {
        return code;
    }

    /** метод установки значения поля {@link Data#code}
     * @param code -код
     */

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
