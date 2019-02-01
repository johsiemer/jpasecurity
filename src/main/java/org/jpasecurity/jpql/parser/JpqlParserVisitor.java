/* Generated By:JJTree: Do not edit this line. JpqlParserVisitor.java
 * Copyright 2008 - 2018 Arne Limburg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */

package org.jpasecurity.jpql.parser;

/**
 * This class is to be implemented by objects that want to visit a JPQL-tree.
 * @author Arne Limburg
 */
public interface JpqlParserVisitor<T> {

    /**
     * Called when visiting a <tt>JpqlStatement</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlStatement node, T data);

    /**
     * Called when visiting a <tt>JpqlAccessRule</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAccessRule node, T data);

    /**
     * Called when visiting a <tt>JpqlSelect</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSelect node, T data);

    /**
     * Called when visiting a <tt>JpqlCreate</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlCreate node, T data);

    /**
     * Called when visiting a <tt>JpqlRead</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlRead node, T data);

    /**
     * Called when visiting a <tt>JpqlUpdate</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlUpdate node, T data);

    /**
     * Called when visiting a <tt>JpqlDelete</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlDelete node, T data);

    /**
     * Called when visiting a <tt>JpqlFrom</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlFrom node, T data);

    /**
     * Called when visiting a <tt>JpqlFromItem</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlFromItem node, T data);

    /**
     * Called when visiting a <tt>JpqlIdentificationVariableDeclaration</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlIdentificationVariableDeclaration node, T data);

    /**
     * Called when visiting a <tt>JpqlInCollection</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlInCollection node, T data);

    /**
     * Called when visiting a <tt>JpqlInnerJoin</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlInnerJoin node, T data);

    /**
     * Called when visiting a <tt>JpqlOuterJoin</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlOuterJoin node, T data);

    /**
     * Called when visiting a <tt>JpqlOuterFetchJoin</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlOuterFetchJoin node, T data);

    /**
     * Called when visiting a <tt>JpqlInnerFetchJoin</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlInnerFetchJoin node, T data);

    /**
     * Called when visiting a <tt>JpqlWith</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlWith node, T data);

    /**
     * Called when visiting a <tt>JpqlPath</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlPath node, T data);

    /**
     * Called when visiting a <tt>JpqlCollectionValuedPath</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlCollectionValuedPath node, T data);

    /**
     * Called when visiting a <tt>JpqlSetClause</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSetClause node, T data);

    /**
     * Called when visiting a <tt>JpqlUpdateItem</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlUpdateItem node, T data);

    /**
     * Called when visiting a <tt>JpqlUpdateValue</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlUpdateValue node, T data);

    /**
     * Called when visiting a <tt>JpqlSelectClause</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSelectClause node, T data);

    /**
     * Called when visiting a <tt>JpqlSelectExpressions</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSelectExpressions node, T data);

    /**
     * Called when visiting a <tt>JpqlSelectExpression</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSelectExpression node, T data);

    /**
     * Called when visiting a <tt>JpqlConstructor</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlConstructor node, T data);

    /**
     * Called when visiting a <tt>JpqlClassName</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlClassName node, T data);

    /**
     * Called when visiting a <tt>JpqlConstructorParameter</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlConstructorParameter node, T data);

    /**
     * Called when visiting a query-part in brackets.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlBrackets node, T data);

    /**
     * Called when visiting a <tt>JpqlDistinct</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlDistinct node, T data);

    /**
     * Called when visiting a <tt>JpqlDistinctPath</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlDistinctPath node, T data);

    /**
     * Called when visiting a <tt>JpqlCount</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlCount node, T data);

    /**
     * Called when visiting a <tt>JpqlAverage</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAverage node, T data);

    /**
     * Called when visiting a <tt>JpqlMaximum</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlMaximum node, T data);

    /**
     * Called when visiting a <tt>JpqlMinimum</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlMinimum node, T data);

    /**
     * Called when visiting a <tt>JpqlSum</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSum node, T data);

    /**
     * Called when visiting a <tt>JpqlWhere</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlWhere node, T data);

    /**
     * Called when visiting a <tt>JpqlGroupBy</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlGroupBy node, T data);

    /**
     * Called when visiting a <tt>JpqlHaving</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlHaving node, T data);

    /**
     * Called when visiting a <tt>JpqlSubselect</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSubselect node, T data);

    /**
     * Called when visiting a <tt>JpqlOr</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlOr node, T data);

    /**
     * Called when visiting a <tt>JpqlAnd</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAnd node, T data);

    /**
     * Called when visiting a <tt>JpqlNot</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlNot node, T data);

    /**
     * Called when visiting a <tt>JpqlBetween</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlBetween node, T data);

    /**
     * Called when visiting a <tt>JpqlIn</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlIn node, T data);

    /**
     * Called when visiting a <tt>JpqlLike</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlLike node, T data);

    /**
     * Called when visiting a <tt>JpqlIsNull</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlIsNull node, T data);

    /**
     * Called when visiting a <tt>JpqlIsEmpty</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlIsEmpty node, T data);

    /**
     * Called when visiting a <tt>JpqlMemberOf</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlMemberOf node, T data);

    /**
     * Called when visiting a <tt>JpqlExists</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlExists node, T data);

    /**
     * Called when visiting a <tt>JpqlAny</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAny node, T data);

    /**
     * Called when visiting a <tt>JpqlAll</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAll node, T data);

    /**
     * Called when visiting a <tt>JpqlKey</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlKey node, T data);

    /**
     * Called when visiting a <tt>JpqlValue</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlValue node, T data);

    /**
     * Called when visiting a <tt>JpqlEntry</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlEntry node, T data);

    /**
     * Called when visiting a <tt>JpqlType</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlType node, T data);

    /**
     * Called when visiting a <tt>JpqlCase</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlCase node, T data);

    /**
     * Called when visiting a <tt>JpqlWhen</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlWhen node, T data);

    /**
     * Called when visiting a <tt>JpqlCoalesce</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlCoalesce node, T data);

    /**
     * Called when visiting a <tt>JpqlNullif</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlNullif node, T data);

    /**
     * Called when visiting a <tt>JpqlEquals</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlEquals node, T data);

    /**
     * Called when visiting a <tt>JpqlNotEquals</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlNotEquals node, T data);

    /**
     * Called when visiting a <tt>JpqlGreaterThan</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlGreaterThan node, T data);

    /**
     * Called when visiting a <tt>JpqlGreaterOrEquals</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlGreaterOrEquals node, T data);

    /**
     * Called when visiting a <tt>JpqlLessThan</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlLessThan node, T data);

    /**
     * Called when visiting a <tt>JpqlLessOrEquals</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlLessOrEquals node, T data);

    /**
     * Called when visiting a <tt>JpqlAdd</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAdd node, T data);

    /**
     * Called when visiting a <tt>JpqlSubtract</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSubtract node, T data);

    /**
     * Called when visiting a <tt>JpqlMultiply</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlMultiply node, T data);

    /**
     * Called when visiting a <tt>JpqlDivide</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlDivide node, T data);

    /**
     * Called when visiting a <tt>JpqlNegative</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlNegative node, T data);

    /**
     * Called when visiting a <tt>JpqlConcat</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlConcat node, T data);

    /**
     * Called when visiting a <tt>JpqlSubstring</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSubstring node, T data);

    /**
     * Called when visiting a <tt>JpqlTrim</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlTrim node, T data);

    /**
     * Called when visiting a <tt>JpqlLower</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlLower node, T data);

    /**
     * Called when visiting a <tt>JpqlUpper</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlUpper node, T data);

    /**
     * Called when visiting a <tt>JpqlTrimLeading</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlTrimLeading node, T data);

    /**
     * Called when visiting a <tt>JpqlTrimTrailing</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlTrimTrailing node, T data);

    /**
     * Called when visiting a <tt>JpqlTrimBoth</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlTrimBoth node, T data);

    /**
     * Called when visiting a <tt>JpqlLength</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlLength node, T data);

    /**
     * Called when visiting a <tt>JpqlLocate</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlLocate node, T data);

    /**
     * Called when visiting a <tt>JpqlAbs</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAbs node, T data);

    /**
     * Called when visiting a <tt>JpqlSqrt</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSqrt node, T data);

    /**
     * Called when visiting a <tt>JpqlMod</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlMod node, T data);

    /**
     * Called when visiting a <tt>JpqlSize</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlSize node, T data);

    /**
     * Called when visiting a <tt>JpqlCurrentDate</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlCurrentDate node, T data);

    /**
     * Called when visiting a <tt>JpqlCurrentTime</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlCurrentTime node, T data);

    /**
     * Called when visiting a <tt>JpqlCurrentTimestamp</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlCurrentTimestamp node, T data);

    /**
     * Called when visiting a <tt>JpqlOrderBy</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlOrderBy node, T data);

    /**
     * Called when visiting a <tt>JpqlOrderByItem</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlOrderByItem node, T data);

    /**
     * Called when visiting a <tt>JpqlAscending</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAscending node, T data);

    /**
     * Called when visiting a <tt>JpqlDescending</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlDescending node, T data);

    /**
     * Called when visiting a <tt>JpqlAbstractSchemaName</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAbstractSchemaName node, T data);

    /**
     * Called when visiting a <tt>JpqlIdentificationVariable</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlIdentificationVariable node, T data);

    /**
     * Called when visiting a <tt>JpqlIntegerLiteral</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlIntegerLiteral node, T data);

    /**
     * Called when visiting a <tt>JpqlDecimalLiteral</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlDecimalLiteral node, T data);

    /**
     * Called when visiting a <tt>JpqlBooleanLiteral</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlBooleanLiteral node, T data);

    /**
     * Called when visiting a <tt>JpqlStringLiteral</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlStringLiteral node, T data);

    /**
     * Called when visiting a <tt>JpqlNamedInputParameter</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlNamedInputParameter node, T data);

    /**
     * Called when visiting a <tt>JpqlPositionalInputParameter</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlPositionalInputParameter node, T data);

    /**
     * Called when visiting a <tt>JpqlPatternValue</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlPatternValue node, T data);

    /**
     * Called when visiting a <tt>JpqlEscapeCharacter</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlEscapeCharacter node, T data);

    /**
     * Called when visiting a <tt>JpqlTrimCharacter</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlTrimCharacter node, T data);

    /**
     * Called when visiting a <tt>JpqlTreat</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlTreat node, T data);

    /**
     * Called when visiting a <tt>JpqlAggregatePath</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlAggregatePath node, T data);

    /**
     * Called when visiting a <tt>JpqlHint</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlHint node, T data);

    /**
     * Called when visiting a <tt>JpqlNoDb</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlNoDbIsAccessible node, T data);

    /**
     * Called when visiting a <tt>JpqlNoCacheIsAccessible</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlNoCacheIsAccessible node, T data);

    /**
     * Called when visiting a <tt>JpqlNoCacheQueryOptimize</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(JpqlNoCacheQueryOptimize node, T data);

    /**
     * Called when visiting a <tt>Node</tt> node.
     * @param node the current node
     * @param data that may be needed by the visitor
     * @return <tt>true</tt>, if the node should go on processing the children
     */
    boolean visit(Node node, T data);
}